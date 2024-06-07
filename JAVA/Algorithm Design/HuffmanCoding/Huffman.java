package HuffmanCoding;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.HashMap;

//Declaration of the class for Huffman Nodes
class HNode{
    char c;
    int data;
    HNode left;
    HNode right;
}

//Declaration of hte public class
public class Huffman {
    //Declaration of the driver class
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  //codes to clear the screen
        System.out.flush();
        int n=0;
        //Program starts
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String sentence = scanner.nextLine();
        //Declaration of the Hashmap for getting the frequencies
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c:sentence.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
        }
        char[] character=new char[freqMap.size()];
        int[] frequencies = new int[freqMap.size()];

        //Creation of the two arrays for the frequency and the character
        int index = 0;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            character[index] = entry.getKey();
            frequencies[index] = entry.getValue();
            index++;
        }
        n=character.length;
        //Declaration of the Pqueue
        PriorityQueue<HNode> pq=new PriorityQueue<HNode>(n,new Comparator<HNode>(){
            @Override
            public int compare(HNode x,HNode y){
                return x.data-y.data;
            }
        });
        
        //Push the values into the priority queue
        for(int i =0;i<n;i++){
            HNode h = new HNode();
            h.c=character[i];
            h.data=frequencies[i];
            h.left=null;
            h.right=null;
            pq.add(h);
        }
        scanner.close();
        HNode root=null;

        //Creating the min heap tree
        while(pq.size()>1){
            HNode x=pq.peek();
            pq.poll();
            HNode y=pq.peek();
            pq.poll();
            HNode infant=new HNode();
            infant.c='-';
            infant.data=x.data+y.data;
            infant.left=x;
            infant.right=y;
            root=infant;
            pq.add(infant);
        }

        //Call the PrintData Function to get the Encoded signals
        PrintData(root,"");
        
        StringBuffer ginger=new StringBuffer();
        for(int i=0;i<sentence.length();i++){
            ginger.append(encodedSignals.get(sentence.charAt(i)));
        }
        ginger.toString();
        System.out.println(ginger);
    }
    static Map<Character,String> encodedSignals=new HashMap<Character,String>(6);
    //Declaration of the function
    public static void PrintData(HNode node,String path){
        if(node.left==null && node.right==null && Character.isLetter(node.c)){
            System.out.println(node.c+" : "+path);
            encodedSignals.put(node.c, path);
            return;
        }
        PrintData(node.left, path+"0");
        PrintData(node.right, path+"1");
    }
}
