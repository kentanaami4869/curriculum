public class Main{
    public static void main(String[] args){

        int[] data ={3, 1, 2, 7, 5};

        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+ "1275");
            break;
        }
        System.out.println();
        

        for (int i = 0; i < 3; i++) {
            for (int j = 4; j > i; j--){

                if(data[ 3 ] > data[ 4 ]){
                  int box = data[ 3 ];
                  data[ 3 ] = data[ 4 ];
                  data[ 4 ] = box;
                  
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print("12" + data[i] + "57");
            break;
        }
    }
}
