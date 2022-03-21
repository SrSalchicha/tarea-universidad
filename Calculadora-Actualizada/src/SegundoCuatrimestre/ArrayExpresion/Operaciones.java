package SegundoCuatrimestre.ArrayExpresion;


public final class Operaciones {

    public Operaciones() {

    }

    public Double Op(String s) {
        //Initialization
        s += ":";
        double result = 0;
        char type = 'n';
        char type2 = 'n';
        int index = 0;
        String variable[] = new String[3];
        variable[0] = "";
        variable[1] = "";
        variable[2] = "";
        char Numbers[] = s.toCharArray();


        //Verification array
        for (char c : Numbers) {
            boolean expression = c != '+' && c != '-' && c != '*' && c != '/' && c != ':';
            System.out.println(c);
            switch (index) {

                case 0 -> {
                    //Verificate the expresion
                    if (expression) {
                        variable[0] += String.valueOf(c);
                    } else {
                        type = c;
                        index = 1;

                    }
                }

                case 1 -> {
                    if (expression) {
                        variable[1] += String.valueOf(c);
                    }
                    else {
                        if (c != '*' && c != '/') {
                            switch (type) {
                                case '+' -> {
                                    if (variable[0] != "" && variable[1] != ""){
                                        result += BReturns.ReturnSum(variable[0], variable[1]);
                                        variable[0] = "";
                                        variable[1] = "";
                                        type = c;
                                    }
                                    else{
                                        result += Double.parseDouble(variable[1]);
                                        variable[0] = "";
                                        variable[1] = "";
                                        type = c;
                                    }
                                }
                                case '-' -> {
                                    if (variable[0] != "" && variable[1] != ""){
                                        result += BReturns.ReturnRes(variable[1], variable[0]);
                                        variable[0] = "";
                                        variable[1] = "";
                                        type = c;
                                    }
                                    else{
                                        result -= Double.parseDouble(variable[1]);
                                        variable[0] = "";
                                        variable[1] = "";
                                        type = c;
                                    }
                                }
                                case '*' -> {
                                    if (variable[0] != "" && variable[1] != ""){
                                        result += BReturns.ReturnMul(variable[0], variable[1]);
                                        variable[0] = "";
                                        variable[1] = "";
                                        type = c;
                                    }
                                    else{
                                        result += Double.parseDouble(variable[1]);
                                        variable[0] = "";
                                        variable[1] = "";
                                        type = c;
                                    }
                                }
                                case '/' -> {
                                    if (variable[1] != "" && variable[0] != ""){
                                        result += Double.parseDouble(variable[0]) / Double.parseDouble(variable[1]);
                                        variable[0] = "";
                                        variable[1] = "";
                                        type = c;
                                    }
                                    else {
                                        result += Double.parseDouble(variable[1]);
                                        variable[0] = "";
                                        variable[1] = "";
                                        type = c;
                                    }
                                }
                            }
                        } else {
                            type2 = c;
                            index = 2;
                        }
                    }
                }

                case 2 -> {
                    if (expression) {
                        variable[2] += String.valueOf(c);
                    }
                    else if (c != ':')
                    {
                        switch (type2) {
                            case '*' -> {
                                switch (type) {
                                    case '+' -> {
                                        result += Double.parseDouble(variable[0]) + (Double.parseDouble(variable[1]) * Double.parseDouble(variable[2]));
                                        variable[0] = String.valueOf(result);
                                        variable[1] = "";
                                        type = c;
                                        index = 1;
                                        result = 0;
                                    }
                                    case '-' -> {
                                        result += Double.parseDouble(variable[0]) - (Double.parseDouble(variable[1]) * Double.parseDouble(variable[2]));
                                        variable[0] = String.valueOf(result);
                                        variable[1] = "";
                                        type = c;
                                        index = 1;
                                        result = 0;
                                    }
                                    case '*' -> {
                                        result += Double.parseDouble(variable[0]) * Double.parseDouble(variable[1]) * Double.parseDouble(variable[2]);
                                        variable[0] = String.valueOf(result);
                                        variable[1] = "";
                                        type = c;
                                        index = 1;
                                        result = 0;
                                    }
                                    case '/' -> {
                                        result += Double.parseDouble(variable[0]) / Double.parseDouble(variable[1]) * Double.parseDouble(variable[2]);
                                        variable[0] = String.valueOf(result);
                                        variable[1] = "";
                                        type = c;
                                        index = 1;
                                        result = 0;
                                    }
                                }
                            }
                            case '/' -> {
                                switch (type) {
                                    case '+' -> {
                                        result += Double.parseDouble(variable[0]) + (Double.parseDouble(variable[1]) / Double.parseDouble(variable[2]));
                                        variable[0] = String.valueOf(result);
                                        variable[1] = "";
                                        type = c;
                                        index = 1;
                                        result = 0;
                                    }
                                    case '-' -> {
                                        result += Double.parseDouble(variable[0]) - (Double.parseDouble(variable[1]) / Double.parseDouble(variable[2]));
                                        variable[0] = String.valueOf(result);
                                        variable[1] = "";
                                        type = c;
                                        index = 1;
                                        result = 0;
                                    }
                                    case '*' -> {
                                        result += Double.parseDouble(variable[0]) * Double.parseDouble(variable[1]) / Double.parseDouble(variable[2]);
                                        variable[0] = String.valueOf(result);
                                        variable[1] = "";
                                        type = c;
                                        index = 1;
                                        System.out.println(result);
                                        result = 0;
                                    }
                                    case '/' -> {
                                        result += Double.parseDouble(variable[0]) / Double.parseDouble(variable[1]) / Double.parseDouble(variable[2]);
                                        variable[0] = String.valueOf(result);
                                        variable[1] = "";
                                        type = c;
                                        result = 0;
                                    }
                                }

                            }
                        }

                    }
                    else {
                        switch (type2) {
                            case '*' -> {
                                switch (type) {
                                    case '+' -> result += Double.parseDouble(variable[0]) + (Double.parseDouble(variable[1]) * Double.parseDouble(variable[2]));

                                    case '-' -> result += Double.parseDouble(variable[0]) - (Double.parseDouble(variable[1]) * Double.parseDouble(variable[2]));

                                    case '*' -> result += Double.parseDouble(variable[0]) * Double.parseDouble(variable[1]) * Double.parseDouble(variable[2]);

                                    case '/' -> result += Double.parseDouble(variable[0]) / Double.parseDouble(variable[1]) * Double.parseDouble(variable[2]);
                                }
                            }
                            case '/' -> {
                                switch (type) {
                                    case '+' -> result += Double.parseDouble(variable[0]) + (Double.parseDouble(variable[1]) / Double.parseDouble(variable[2]));

                                    case '-' -> result += Double.parseDouble(variable[0]) - (Double.parseDouble(variable[1]) / Double.parseDouble(variable[2]));

                                    case '*' -> result += Double.parseDouble(variable[0]) * Double.parseDouble(variable[1]) / Double.parseDouble(variable[2]);

                                    case '/' -> result += Double.parseDouble(variable[0]) / Double.parseDouble(variable[1]) / Double.parseDouble(variable[2]);

                                }

                            }
                        }

                    }
                }

            }
        }
        return result;
    }
}