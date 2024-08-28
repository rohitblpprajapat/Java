package week3;


 class India{
        public India(){
              System.out.println("Visit Northeast India.");
        }
}
 class Northeast extends India{
        public Northeast(){        
              System.out.println("Kolkata connects Manipur,Assam, Nagaland and Tripura directly by air.");                
        }
}
public class aq3_2{
        public static void main(String[] args){
              Northeast charming = new Northeast();   
        }
}   
