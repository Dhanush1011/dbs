/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author karupakula
 */
public class Decomp_2NF {
    
    public Set<String> decomp2nf(HashMap<String, String> fds, String rls, Set<String> ckset)
    {
        Character[] rlsarr = ArrayUtils.toObject(rls.toCharArray());
        Set<Character> rlsset = new HashSet<Character>(Arrays.asList(rlsarr));
        
        Set<Character> pset = new HashSet<Character>();
        for(String x : ckset)
        {
            Character[] templ = ArrayUtils.toObject(x.toCharArray());
            for(Character y : templ)
                pset.add(y);
            
            
        }
        
        String x;
        
        String temp = new String();
        String temps = new String();
        
        Set<String> relations = new HashSet<String>();
        int n = fds.size();
        int[] flag = new int[n];
        for(int i=0; i<n; i++)
            flag[i] = 0;
        int count=0;
        for(Map.Entry<String, String> entry : fds.entrySet())
        {
            x = entry.getKey();
            for(String ck : ckset)
            {
                if(checksubstring(ck,x))
                {
                    Set<Character> tempset = new HashSet<Character>(Arrays.asList(ArrayUtils.toObject(entry.getValue().toCharArray())));
                    for(Character c : tempset)
                    {
                        if(!pset.contains(c))
                            rlsset.remove(c);
                    }
                    relations.add(x.concat(entry.getValue()));
                    flag[count] = 1;
                    break;
                }
            }
            count++;            
        }
        
        count = 0;
        for(Map.Entry<String, String> entry : fds.entrySet())
        {
            x = entry.getKey();
            int flagck = 0;
            for(String ck : ckset)
            {
                if(checkstring(x,ck))
                    flagck = 1;
            }
            
            if(flagck==0 && flag[count]==0)
            {
                String tempval = "";
                
                for (String s : relations) {
                    if(checkstring(s,x))
                    {
                        temps = new String(s);
                        temp = new String(s);
                        for(char c : entry.getValue().toCharArray())
                        {
                            if(temp.indexOf(c)==-1)
                            {
                                temp = temp + c;
                                tempval = tempval + c;
                        
                            }
                        }
                        break;
                    }                    
                }
                
                if(!temp.isEmpty())                    
                {
                    Set<Character> tempset = new HashSet<Character>(Arrays.asList(ArrayUtils.toObject(tempval.toCharArray())));
                    for(Character c : tempset)
                    {
                        if(!pset.contains(c))
                            rlsset.remove(c);
                    }
                    System.out.println(rlsset.toString());
                    relations.remove(temps);
                    relations.add(temp);
                }
            }
            count++;
        }
        
        
        Character[] rfin = new Character[rlsset.size()];
        rlsset.toArray(rfin);
        String rfinnew = new String(ArrayUtils.toPrimitive(rfin));
        relations.add(rfinnew);
        System.out.println(relations.toString());
        return relations;
    }
    
    public boolean sameChars(String firstStr, String secondStr) 
    {
        char[] first = firstStr.toCharArray();
        char[] second = secondStr.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
    
    public boolean checksubstring(String s1, String s2)
    {
        char[] first = s1.toCharArray();
        char[] second = s2.toCharArray();
        int flag = 0;
        for(char c : second)
        {
            if(s1.indexOf(c)==-1)
            {
                flag = 1;
            }
        }
        return (flag==0 && s1.length()>s2.length());
    }
    
    public boolean checkstring(String s1, String s2)
    {
        char[] first = s1.toCharArray();
        char[] second = s2.toCharArray();
        int flag = 0;
        for(char c : second)
        {
            if(s1.indexOf(c)==-1)
            {
                flag = 1;
            }
        }
        return (flag==0 );
    }
}
