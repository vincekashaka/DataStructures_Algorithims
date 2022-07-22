package com.vince.opp.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
//            int c = a / b;
//            divide(a, b);

          String name = "Vince";
          if (name.equals("Vince")){
              throw new MyException("name is vince");
          }
        }catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Ths will always run ");
        }
    }

        static int divide(int a, int b) throws ArithmeticException {
            if (b == 0){
                throw  new ArithmeticException("please do not divide by zero");
            }
            return a/b;
        }
    }

