package poc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args){

        List<Block> BlockChainL = new ArrayList<>();

        //First block
        Block genesis = new Block("Blockchain PoC!", 0);

        BlockChainL.add(genesis);


        //Adding more blocks
        Block block1 = new Block("I am the first block", BlockChainL.get(BlockChainL.size()-1).hashCode());
        BlockChainL.add(block1);

        Block block2 = new Block("I am the second block", BlockChainL.get(BlockChainL.size()-1).hashCode());
        BlockChainL.add(block2);
        
        Block block3 = new Block("I am the third block", BlockChainL.get(BlockChainL.size()-1).hashCode());
        BlockChainL.add(block3);

        Block block4 = new Block("I am the fourth block", BlockChainL.get(BlockChainL.size()-1).hashCode());
        BlockChainL.add(block4);


        System.out.println("Proof of Concept of Blockchain implemented in Java");

        BlockChainL.forEach(System.out::println);

    }
}
