/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author karupakula
 */
public class Bucket {
    
    String id;
    int bfr;
    int ld;
    ArrayList<Integer> buck;
    
    public Bucket()
    {
        
    }
    
    public Bucket(String s,int ldi,int bfr)
    {
        this.id = s;
        this.ld = ldi;
        this.bfr = bfr;
        buck = new ArrayList<Integer>();
    }
    
    public boolean isFull()
    {
        if(this.buck.size()>=bfr)
            return true;
        else
            return false;
    }
    
    public void addtobuck(int i)
    {
        this.buck.add(i);
    }
    
}
