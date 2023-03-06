public class Main {

    public static void main(String[] args) {

        int x = 3;

        // Pas deze assignement aan zodat variable `four` de waarde `4` toegewezen krijgt.
        int four = x + 1;
        // Pas deze assignement aan zodat variable `one` de waarde `1` toegewezen krijgt.
        int one = x - 2;
        // Pas deze assignement aan zodat variable `three_point_5` de float(!) waarde `3.5` toegewezen krijgt.
        float three_point_5 = x + 0.5f;
        // Pas deze assignement aan zodat variable `one_point_5` de waarde `1.5` toegewezen krijgt.
        double one_point_5 = x - 1.5;
        // Pas deze assignement aan zodat variable `zero` de waarde `0` toegewezen krijgt. Je mag geen +, -, * of / gebruiken.
        //De modulus operator "%" geeft de restwaarde van de deling terug. In dit geval, als de waarde van "x" deelbaar is door 3, dan zal "zero" geinitialiseerd worden op 0. Anders zal "zero" de restwaarde van de deling krijgen, wat een waarde zal zijn tussen 1 en 2 inclusief.
        int zero = x % 3;
        // Wat kunnen we op de lege regel hieronder schrijven zodat de System.out.println daaronder klopt?
        x += 3; // zet je de x niet voor de =, dan geeft het 3 in plaats van x+3=6
        System.out.println(x); // six
        // Pas onderstaand statement aan zodat dat statement en het statement daarna kloppen
        System.out.println(x++); // six
        System.out.println(x); // seven
        System.out.println(x--); // seven
        System.out.println(x); // six
        // Pas onderstaan statement aan zodat het statement klopt.
        System.out.println(++x); // seven
        System.out.println(--x); // six

        int left = 5;
        int right = 0;
        boolean bool = false;

        //a1 voeg een assignment toe voor de variabele `right` zodat boolean `a1` true is.
        right = 7;
        boolean a1 = left < right;

        //a2 voeg een assignment toe voor de variabele `right` zodat boolean `a2` true is.
        right = 3;
        boolean a2 = left > right;

        //a3 voeg een assignment toe voor de variabele `right` zodat boolean `a3` true is.
        right = 5;
        boolean a3 = left == right;

        //a4 voeg een assignment toe voor de variabele `bool` zodat boolean `a4` true is.
        bool = true;
        boolean a4 = left <= 3 || bool;

        //a5 voeg een assignment toe voor de variabele `bool` zodat boolean `a5` true is.
        bool = false;
        boolean a5 = left > 4 && !bool;


        // Pas geen code onder deze regel aan
        System.out.println(four);
        System.out.println(one);
        System.out.println(three_point_5);
        System.out.println(one_point_5);
        System.out.println(zero);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
    }
}
