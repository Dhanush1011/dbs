/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author karupakula
 */
public class trialkeys {
    
    public HashMap<String, Set<String>> decompsedkeys(HashMap<String, String> fds, Set<String> relations)
    {
        HashMap<String, Set<String>> finalmap = new HashMap<String, Set<String>>();
        CandidateKey ck = new CandidateKey();
        Closure_D closure = new Closure_D();
        for(String rl : relations)
        {
            HashMap<String, String> tempfd = new HashMap<String,String>();
            int index,lt,flag;
            char[] rlarr = rl.toCharArray();
            int[] sel = new int[rl.length()];
            String temp;
            String s;
            for(int i=0;i<Math.pow(2,rl.length())-1;i++)
            {
                for(int l=0; l<rl.length(); l++)
                        sel[l] = 0;
                
                index = 0;
                temp = new String();
                    
                lt = i;
                while(lt>0)
                {
                    sel[index++] = lt%2;
                    lt = lt/2;
                }
                
                for(int l=0; l<rl.length(); l++)
                {
                    if(sel[l]==1)
                    {
                        temp = temp + rlarr[l]; 
                    }                      
                }
                
                s = closure.findclosure(fds, temp);
                String sval = new String();
                for(char ch : s.toCharArray())
                {
                    if(rl.indexOf(ch)!=-1 && temp.indexOf(ch)==-1)
                    {
                        sval = sval+ch;
                    }
                }
                
                if(!sval.isEmpty())
                {
                    tempfd.put(temp, sval);
                }                
            }
            
            Set<String> ckset = new HashSet<String>();
            ckset = ck.findCandidateKey(tempfd, rl);
            
            finalmap.put(rl, ckset);
        }
        
        return finalmap;
    }
    
}
