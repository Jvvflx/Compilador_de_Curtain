package curtain;
import curtain.lexer.*;
import curtain.node.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo = "/home/john/Códigos/Ambiente-Java/Compilador_de_Curtain/teste/teste.crtn";

			// Teste do Parser
			// Parser parser = new Parser(
			// 					new Lexer(
			// 						new PushbackReader(  
			// 								new FileReader(arquivo), 1024))); 
			// 								// new InputStreamReader(System.in), 1024)));
			// Start tree = parser.parse();

			// tree.apply(new Translation());

			// Teste do Lexer
			Lexer lexer = new Lexer(
								new PushbackReader(  
										new FileReader(arquivo), 1024)); 
										// new InputStreamReader(System.in), 1024)));
			Token token;
			while(!((token = lexer.next()) instanceof EOF)){
				System.out.println(token.getClass());
				System.out.println("( " + token.toString() + ")");
			}

			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}