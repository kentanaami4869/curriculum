public class Main{
    public static void main(String[] args){

        int[] data ={3, 1, 2, 7, 5};

        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+ "1275");
            break;
        }
        System.out.println();
        

        for (int i = 0; i< data.length -1; i++) {
            for (int j = data.length -1;j> i; j--){

                if(data[ j - i ] > data[ j ]){
                  int box = data[ j - i ];
                  data[ j - i ] = data[ j ];
                  data[ j ] = box;
                  
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print("12" + data[i] + "57");
            break;
        }
    }
}
