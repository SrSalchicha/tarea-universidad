import java.io.Serializable;

public final class Operaciones {

    public Operaciones(){

    }

    public Double Op(String s){
        //Initialization of objects
        char Expresion[] = s.toCharArray();
        String Numbers[] = new String[3];
        Double result[] = new Double[2];

        //Verification array
        int operatorIndex = 0;
        for (char c: Expresion) {

            // if operator doesn't equals to (+-/) Numbers - 0 can get the char value
            final Serializable serializable = (c != '+' && c != '-' && c != '/' && c != '*') ? c : "";
            switch (operatorIndex){
                case 0 -> Numbers[0] += serializable;
                case 1 -> Numbers[1] += serializable;
                case 2 -> Numbers[2] += serializable;
            }

            switch (c){
                case '+' -> {
                    switch (operatorIndex){
                        case 0 -> {

                        }
                        case 1 , 2 -> {

                        }
                    }
                }
                case '-' ->{
                    switch (operatorIndex){
                        case 0 -> {

                        }
                        case 1 , 2 -> {

                        }
                    }
                }
                case '/' ->{
                    switch (operatorIndex){
                        case 0 -> {

                        }
                        case 1 , 2 -> {

                        }
                    }
                }
                case '*' ->{
                    switch (operatorIndex){
                        case 0 -> {

                        }
                        case 1 , 2 -> {

                        }
                    }
                }
            }



        }
        return result[0] + result[1] + result[2];
    }


}
