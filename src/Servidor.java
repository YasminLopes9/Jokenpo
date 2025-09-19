
import java.net.*;
import java.io.*;

public class Servidor{
        public static void main(String[] args) throws Exception {
            ServerSocket servidor = new ServerSocket(12345);
            System.out.println("Servidor aguardando 2 clientes...");


            Socket clienteA = servidor.accept();
            System.out.println("Cliente A conectado!");
            BufferedReader inA = new BufferedReader(new InputStreamReader(clienteA.getInputStream()));
            PrintWriter outA = new PrintWriter(clienteA.getOutputStream(), true);



            Socket clienteB = servidor.accept();
            System.out.println("Cliente B conectado!");
            BufferedReader inB = new BufferedReader(new InputStreamReader(clienteB.getInputStream()));
            PrintWriter outB = new PrintWriter(clienteB.getOutputStream(), true);



            String yasmin = inA.readLine();
            String anafuvia = inB.readLine();




            if(yasmin.equals("Tesoura")&& anafuvia.equals("Pedra")){
                outA.println("Parabéns, você ganhou!");
                outB.println("Infelizmente você perdeu!");
            }


            else if (yasmin.equals("Tesoura")&& anafuvia.equals("Papel")){
                outA.println("Parabéns, você ganhou!");
                outB.println("Infelizmente você perdeu!");




            }
            else if (yasmin.equals("Tesoura")&& anafuvia.equals("Tesoura")){
                outA.println("Deu empate");
                outB.println("Deu empate");


            }


            else if (yasmin.equals("Pedra")&& anafuvia.equals("Tesoura")){
                outA.println("Parabéns, você ganhou!");
                outB.println("Infelizmente você perdeu!");


            }


            else if (yasmin.equals("Pedra")&& anafuvia.equals("Papel")){
                outA.println("Parabéns, você ganhou!");
                outB.println("Infelizmente você perdeu!");
            }


            else if (yasmin.equals("Pedra")&& anafuvia.equals("Pedra")){
                outA.println("Empate!");
                outB.println("Empate!");


            }


            else if (yasmin.equals("Papel")&& anafuvia.equals("Pedra")){
                outA.println("Parabéns, você ganhou!");
                outB.println("Infelizmente você perdeu!");


            }


            else if (yasmin.equals("Papel")&& anafuvia.equals("Tesoura")){
                outA.println("Parabéns, você ganhou!");
                outB.println("Infelizmente você perdeu!");


            }
            else if (yasmin.equals("Papel")&& anafuvia.equals("Papel")){
                outA.println("Empate!");
                outB.println("Empate!");


            }







            clienteA.close();
            clienteB.close();
            servidor.close();
        }
    }







