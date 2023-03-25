public class App {
    public static void main(String[] args) {
        String[] names = new String [] {"Ana", "Paula", "Mary"};
        String[] namesTwo = new String [] {"Paulao", "Joana", "Ana"};

        for(int i=0; i< names.length; i++){
            for(int j=0; j<namesTwo.length; j++){
                if(names[i]==namesTwo[j]){
                    System.out.println(names[i]);
                }
            }
        }
    }
}
