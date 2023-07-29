package OPPE_MOCK_1;

public class problem4 {
      public static void main(String[] args) {
            try{
                 int a=10/0;
            }
            catch(Exception e){
                 System.out.println(e);
            }
            finally{
                 System.out.println("Hello Exception");
            }
           
      }
}
