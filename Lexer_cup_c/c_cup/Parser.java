
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun May 29 17:55:10 CEST 2016
//----------------------------------------------------

import java.io.*;
import java_cup.runtime.*;
import java.util.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun May 29 17:55:10 CEST 2016
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\063\000\002\002\004\000\002\002\004\000\002\002" +
    "\004\000\002\002\002\000\002\003\005\000\002\003\007" +
    "\000\002\003\005\000\002\003\007\000\002\011\004\000" +
    "\002\011\004\000\002\011\004\000\002\011\004\000\002" +
    "\005\003\000\002\005\003\000\002\005\003\000\002\010" +
    "\003\000\002\010\003\000\002\010\002\000\002\004\012" +
    "\000\002\004\012\000\002\006\003\000\002\007\003\000" +
    "\002\012\006\000\002\012\004\000\002\012\006\000\002" +
    "\012\004\000\002\013\004\000\002\013\004\000\002\013" +
    "\002\000\002\014\004\000\002\015\002\000\002\016\003" +
    "\000\002\016\003\000\002\016\003\000\002\016\003\000" +
    "\002\016\003\000\002\016\003\000\002\016\003\000\002" +
    "\016\003\000\002\016\003\000\002\017\003\000\002\017" +
    "\003\000\002\017\003\000\002\017\003\000\002\017\003" +
    "\000\002\017\003\000\002\017\003\000\002\017\003\000" +
    "\002\017\003\000\002\017\003\000\002\017\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\030\002\ufffe\011\015\050\ufff0\051\ufff0\052" +
    "\ufff0\053\ufff0\054\017\055\016\056\020\057\011\062\012" +
    "\001\002\000\004\011\ufff3\001\002\000\004\002\077\001" +
    "\002\000\030\002\ufffe\011\015\050\ufff0\051\ufff0\052\ufff0" +
    "\053\ufff0\054\017\055\016\056\020\057\011\062\012\001" +
    "\002\000\012\050\074\051\073\052\075\053\072\001\002" +
    "\000\004\011\065\001\002\000\004\011\ufff4\001\002\000" +
    "\004\011\uffed\001\002\000\004\011\056\001\002\000\004" +
    "\011\023\001\002\000\004\011\uffec\001\002\000\012\050" +
    "\ufff1\051\ufff1\052\ufff1\053\ufff1\001\002\000\012\050\ufff2" +
    "\051\ufff2\052\ufff2\053\ufff2\001\002\000\004\011\ufff5\001" +
    "\002\000\030\002\ufffe\011\015\050\ufff0\051\ufff0\052\ufff0" +
    "\053\ufff0\054\017\055\016\056\020\057\011\062\012\001" +
    "\002\000\004\002\000\001\002\000\004\107\024\001\002" +
    "\000\024\011\015\050\ufff0\051\ufff0\052\ufff0\053\ufff0\054" +
    "\017\055\016\056\020\057\011\001\002\000\004\011\053" +
    "\001\002\000\004\011\050\001\002\000\004\110\030\001" +
    "\002\000\004\103\031\001\002\000\030\011\015\050\ufff0" +
    "\051\ufff0\052\ufff0\053\ufff0\054\017\055\016\056\020\057" +
    "\011\102\uffe3\104\uffe5\001\002\000\004\104\047\001\002" +
    "\000\004\011\042\001\002\000\004\102\041\001\002\000" +
    "\030\011\015\050\ufff0\051\ufff0\052\ufff0\053\ufff0\054\017" +
    "\055\016\056\020\057\011\102\uffe3\104\uffe5\001\002\000" +
    "\030\011\015\050\ufff0\051\ufff0\052\ufff0\053\ufff0\054\017" +
    "\055\016\056\020\057\011\102\uffe3\104\uffe5\001\002\000" +
    "\004\104\uffe7\001\002\000\004\104\uffe6\001\002\000\030" +
    "\011\uffe4\050\uffe4\051\uffe4\052\uffe4\053\uffe4\054\uffe4\055" +
    "\uffe4\056\uffe4\057\uffe4\102\uffe4\104\uffe4\001\002\000\006" +
    "\005\043\102\044\001\002\000\004\012\045\001\002\000" +
    "\034\002\ufffd\011\ufffd\050\ufffd\051\ufffd\052\ufffd\053\ufffd" +
    "\054\ufffd\055\ufffd\056\ufffd\057\ufffd\062\ufffd\102\ufffd\104" +
    "\ufffd\001\002\000\004\102\046\001\002\000\034\002\ufffc" +
    "\011\ufffc\050\ufffc\051\ufffc\052\ufffc\053\ufffc\054\ufffc\055" +
    "\ufffc\056\ufffc\057\ufffc\062\ufffc\102\ufffc\104\ufffc\001\002" +
    "\000\030\002\uffee\011\uffee\050\uffee\051\uffee\052\uffee\053" +
    "\uffee\054\uffee\055\uffee\056\uffee\057\uffee\062\uffee\001\002" +
    "\000\006\105\051\110\uffea\001\002\000\024\011\015\050" +
    "\ufff0\051\ufff0\052\ufff0\053\ufff0\054\017\055\016\056\020" +
    "\057\011\001\002\000\004\110\uffeb\001\002\000\006\105" +
    "\054\110\uffe8\001\002\000\024\011\015\050\ufff0\051\ufff0" +
    "\052\ufff0\053\ufff0\054\017\055\016\056\020\057\011\001" +
    "\002\000\004\110\uffe9\001\002\000\010\005\043\102\044" +
    "\107\057\001\002\000\024\011\015\050\ufff0\051\ufff0\052" +
    "\ufff0\053\ufff0\054\017\055\016\056\020\057\011\001\002" +
    "\000\004\110\061\001\002\000\004\103\062\001\002\000" +
    "\030\011\015\050\ufff0\051\ufff0\052\ufff0\053\ufff0\054\017" +
    "\055\016\056\020\057\011\102\uffe3\104\uffe5\001\002\000" +
    "\004\104\064\001\002\000\030\002\uffef\011\uffef\050\uffef" +
    "\051\uffef\052\uffef\053\uffef\054\uffef\055\uffef\056\uffef\057" +
    "\uffef\062\uffef\001\002\000\006\005\066\102\067\001\002" +
    "\000\004\007\070\001\002\000\034\002\ufffb\011\ufffb\050" +
    "\ufffb\051\ufffb\052\ufffb\053\ufffb\054\ufffb\055\ufffb\056\ufffb" +
    "\057\ufffb\062\ufffb\102\ufffb\104\ufffb\001\002\000\004\102" +
    "\071\001\002\000\034\002\ufffa\011\ufffa\050\ufffa\051\ufffa" +
    "\052\ufffa\053\ufffa\054\ufffa\055\ufffa\056\ufffa\057\ufffa\062" +
    "\ufffa\102\ufffa\104\ufffa\001\002\000\004\011\ufff6\001\002" +
    "\000\004\011\ufff8\001\002\000\004\011\ufff9\001\002\000" +
    "\004\011\ufff7\001\002\000\004\002\uffff\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\022\002\004\003\020\004\005\005\012\006" +
    "\013\007\007\010\006\011\003\001\001\000\002\001\001" +
    "\000\002\001\001\000\022\002\075\003\020\004\005\005" +
    "\012\006\013\007\007\010\006\011\003\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\022\002\021\003\020\004\005\005\012\006\013\007\007" +
    "\010\006\011\003\001\001\000\002\001\001\000\002\001" +
    "\001\000\014\005\025\007\024\010\006\011\003\012\026" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\022\003\035\005\032\007\007" +
    "\010\006\011\003\013\031\014\034\015\033\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\022" +
    "\003\035\005\032\007\007\010\006\011\003\013\037\014" +
    "\034\015\033\001\001\000\022\003\035\005\032\007\007" +
    "\010\006\011\003\013\036\014\034\015\033\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\005\025\007\024\010\006\011\003\012\051\001" +
    "\001\000\002\001\001\000\002\001\001\000\014\005\025" +
    "\007\024\010\006\011\003\012\054\001\001\000\002\001" +
    "\001\000\002\001\001\000\014\005\025\007\024\010\006" +
    "\011\003\012\057\001\001\000\002\001\001\000\002\001" +
    "\001\000\022\003\035\005\032\007\007\010\006\011\003" +
    "\013\062\014\034\015\033\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public void syntax_error(Symbol cur_token){
	System.err.println("Syntax error at "+cur_token);
    }
   

    public static void main(String args[]) {
	try {
	    CLexer lexer = new CLexer(new FileReader(args[0]));
	    // start parsing
	    Parser p = new Parser(lexer);
	    System.out.println("Parser runs: ");
            p.parse();
	    System.out.println("Parsing finished!");
	} catch (Exception e) {
	    e.printStackTrace();
	} 
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // assignment_operator ::= OREQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // assignment_operator ::= XOREQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // assignment_operator ::= ANDEQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // assignment_operator ::= RSHIFTEQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // assignment_operator ::= LSHIFTEQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // assignment_operator ::= MINUSEQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // assignment_operator ::= PLUSEQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // assignment_operator ::= MODEQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // assignment_operator ::= DIVEQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // assignment_operator ::= MULTEQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // assignment_operator ::= EQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // operator ::= MOD 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // operator ::= OR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // operator ::= AND 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // operator ::= PLUS 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // operator ::= XOR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // operator ::= MINUS 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // operator ::= MULT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // operator ::= DIV 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // operator ::= MULT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // expression ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // statement ::= expression SEMICOLON 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // function_body ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_body",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // function_body ::= statement function_body 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_body",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // function_body ::= var_declaration function_body 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_body",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // param_list ::= struct_specifier ID 
            {
              Object RESULT =null;
		int suleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int suright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object su = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("param_list",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // param_list ::= struct_specifier ID COMMA param_list 
            {
              Object RESULT =null;
		int suleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int suright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object su = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("param_list",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // param_list ::= type_var ID 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("param_list",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // param_list ::= type_var ID COMMA param_list 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("param_list",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // struct_specifier ::= ID 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("struct_specifier",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // type_specifier ::= VOID 
            {
              Object RESULT =null;
		int typeleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object type = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type_specifier",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // function_declaration ::= type_specifier ID LPAREN param_list RPAREN LBRACE function_body RBRACE 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_declaration",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // function_declaration ::= type_var ID LPAREN param_list RPAREN LBRACE function_body RBRACE 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_declaration",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // type_sign ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type_sign",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // type_sign ::= UNSIGNED 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type_sign",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // type_sign ::= SIGNED 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type_sign",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // type_var ::= type_var_sign_unsign 
            {
              Object RESULT =null;
		int typeleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object type = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type_var",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // type_var ::= DOUBLE_TYPE 
            {
              Object RESULT =null;
		int typeleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object type = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type_var",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // type_var ::= FLOAT_TYPE 
            {
              Object RESULT =null;
		int typeleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object type = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type_var",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // type_var_sign_unsign ::= type_sign LONG_TYPE 
            {
              Object RESULT =null;
		int typeleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object type = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type_var_sign_unsign",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // type_var_sign_unsign ::= type_sign INT_TYPE 
            {
              Object RESULT =null;
		int typeleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object type = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type_var_sign_unsign",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // type_var_sign_unsign ::= type_sign SHORT_TYPE 
            {
              Object RESULT =null;
		int typeleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object type = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type_var_sign_unsign",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // type_var_sign_unsign ::= type_sign CHAR_TYPE 
            {
              Object RESULT =null;
		int typeleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object type = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type_var_sign_unsign",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // var_declaration ::= struct_specifier ID EQ NULL_LITERAL SEMICOLON 
            {
              Object RESULT =null;
		int suleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int suright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Object su = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("var_declaration",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // var_declaration ::= struct_specifier ID SEMICOLON 
            {
              Object RESULT =null;
		int suleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int suright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object su = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("var_declaration",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // var_declaration ::= type_var ID EQ CONSTANT SEMICOLON 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("var_declaration",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // var_declaration ::= type_var ID SEMICOLON 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("var_declaration",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declaration ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaration",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // declaration ::= function_declaration declaration 
            {
              Object RESULT =null;
		 System.out.println("function_declaration"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaration",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // declaration ::= var_declaration declaration 
            {
              Object RESULT =null;
		 System.out.println("var_declaration"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaration",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= declaration EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
