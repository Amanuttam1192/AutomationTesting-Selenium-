public class PrintLinkedList
    public static void main(String args[])
   {    
        LinkedList<String> domesticAnimals = new LinkedList<>(
                List.of("cow", "hen", "goat", "sheep", "donkey"));
 
        for (int i = 0; i < domesticAnimals.size(); i++) {
            System.out.println(i +" = "+domesticAnimals.get(i));
        }
    }
}