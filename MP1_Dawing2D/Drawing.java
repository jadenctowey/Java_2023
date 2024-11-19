public class Drawing{ 

    //1) print canvas method
        public static void printCanvas(char[][] canvas){
            for(int i = 0; i < canvas.length; i++){
                for(int j = 0; j < canvas[0].length; j++){
                    if(j==0){
                        System.out.print(canvas.length - i - 1);
                    }
                    System.out.print(canvas[i][j]);
                }
                System.out.println();
            }
            System.out.print(" ");
    
            for(int i = 0; i < canvas[0].length; i++){
                System.out.print(i);
            }
            System.out.println();
        }
    
    //2) create canvas method
        public static void createCanvas(char[][] canvas){
            canvas[0][0] = '+';
            canvas[0][(canvas[0].length)-1] = '+';
            canvas[(canvas.length)-1][0] = '+';
            canvas[(canvas.length)-1][(canvas[0].length) - 1] = '+';
    
            for(int i = 1; i < canvas.length-1; i++){
                canvas [i][0] = '|';
                canvas[i][(canvas[0].length)-1] = '|';
            }
    
            for(int j = 1; j < canvas.length-1; j++){
                canvas [0][j] = '=';
                canvas[(canvas.length)-1][j] = '=';
            }
    
            for(int i = 1; i < canvas.length-1; i++){
                for(int j = 1;  j <canvas[0].length-1; j++){
                    canvas[i][j] = ' ' ;
                }
            }
        }
    
    //3) add character method 
        public static void addCharacter(char[][] canvas, char input, int xc, int yc){
            canvas[canvas.length - yc -1][xc] = input;
        }
            
    //4) main method 
        public static void main(String[] args){
            char[][] canvas = new char[5][10];
            createCanvas(canvas);
            addCharacter(canvas, '<', 6, 3);
            addCharacter(canvas, '3', 7, 3);
            addCharacter(canvas, '<', 2, 3);
            addCharacter(canvas, '3', 3, 3);
            addCharacter(canvas, '.', 4, 2);
            addCharacter(canvas, '-', 4, 1);
            addCharacter(canvas, '-', 5, 1);
    
            printCanvas(canvas);
        }
}
    
    