package poc;

import java.util.Arrays;

public class Block {

    private int previousHash;
    private String data;
    private int hash;

    public Block(String data, int prevHash){

        this.data = data;
        this.previousHash = prevHash;
        
        this.hash = Arrays.hashCode(new Integer[]{data.hashCode(), previousHash});
    }

}