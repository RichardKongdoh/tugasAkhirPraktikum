
package tugasakhir;


public class TugasAkhir {

    public static void main(String[] args) {
    
    int i,j,m;
        
        //----------------------
        for (i = 0; i < 5; i++){
            System.out.print("* ");     
            System.out.print("  ");
        //----------------------
        
        //----------------------
        for (j = 0; j < 3; j++){
            if (i == 0 || i == 2 || i == 4){
                System.out.print("* ");
            } else if (i == 1 && j == 2){
                System.out.print("* ");
            } else if (i == 3 && j == 0){
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }                      
      }  
      System.out.print("  ");
      //----------------------
      
      //----------------------
        for (m = 0; m < 4; m++){
            if (i == 0 || i == 2){
                    System.out.print("* ");
                } else if ((i == 1 && m == 0) || (i == 1 &&  m == 3)){
                    System.out.print("* ");     
                } else if ((i == 3 && m == 0) || (i == 3 && m == 2)) {
                    System.out.print("* ");     
                } else if ((i == 4 && m == 0) || (i == 4 && m == 3)) {
                    System.out.print("* ");     
                } else {
                    System.out.print("  ");
                }
            } 
            System.out.println();            
        }
    
    }
         
}
