package paypal; /**

package paypal;

import Jama.Matrix;
import java.lang.Math.*;

/*
 *Solving three variable linear equation system
 * 3x + 2y -  z =  1 ---&gt; Eqn(1)
 * 2x - 2y + 4z = -2 ---&gt; Eqn(2)
 * -x + y/2-  z =  0 ---&gt; Eqn(3)
 *
 */


/**
 *

    public class Main {
        public Main() {
            //Creating  Arrays Representing Equations
            double[][] lhsArray = {{3, 2, -1}, {2, -2, 4}, {-1, 0.5, -1}};
            double[] rhsArray = {1, -2, 0};
            double[] rhsArray1 = {0, 0, 0,0};
            //Creating Matrix Objects with arrays
            Matrix lhs = new Matrix(lhsArray);
            Matrix rhs = new Matrix(rhsArray, 3);

            //Calculate Solved Matrix
            Matrix ans = lhs.solve(rhs);
            //Printing Answers
            System.out.println("x = " + Math.round(ans.get(0, 0)));
            System.out.println("y = " + Math.round(ans.get(1, 0)));
            System.out.println("z = " + Math.round(ans.get(2, 0)));
        }
        public static void main(String[] args) {
            new Main();
        }
    }

 */
