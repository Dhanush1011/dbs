/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;

/**
 *
 * @author karupakula
 */
public class Misc {
    
    public int[] tobin(int i, int x)
    {
        
        int ret[] = new int[x];
        for(int l=0; l<x; l++)
            ret[l] = 0;
        
        int mval = i;
        int lt = x-1;
        while(mval>0)
        {
            ret[lt] = mval%2;
            mval = mval/2;
            lt--;
        }
        
        return ret;
    }
    
    public String bintostr(int[] bin)
    {
        String s = new String();
        for(int l=0; l<bin.length; l++)
        {
            char c;
            if(bin[l]==0)
                c='0';
            else
                c='1';
            
            s = s + c;
        }
        
        return s;
    }
}
