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
public class Hash {
    
    public int[] hval(int i,int mod, int sz)
    {
        int ret[] = new int[sz];
        for(int l=0; l<sz; l++)
            ret[l] = 0;
        
        int mval;
        mval = i%mod;
        
        int l = sz-1;
        while(mval>0)
        {
            ret[l] = mval%2;
            mval = mval/2;
            l--;
        }
        
        return ret;
    }
}
