/* The following code was generated by JFlex 1.4.1 on 26/03/18 16:27 */

// ************  Código a incluir ********************

package scanner;
import parser.Parser;
import ast.types.ErrorType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 26/03/18 16:27 from the specification file
 * <tt>src/scanner/scanner.jflex</tt>
 */
public class Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\3\2\0\1\1\22\0\1\1\1\21\1\4\1\2"+
    "\1\0\1\45\1\22\1\11\3\45\1\10\1\45\1\10\1\6\1\45"+
    "\12\5\2\45\1\17\1\16\1\20\2\0\4\15\1\7\25\15\1\45"+
    "\1\12\1\45\1\0\1\15\1\0\1\42\1\40\1\41\1\30\1\31"+
    "\1\32\1\15\1\34\1\24\2\15\1\35\1\44\1\13\1\37\1\25"+
    "\1\15\1\27\1\36\1\14\1\26\1\43\1\33\3\15\1\45\1\23"+
    "\1\45\103\0\1\15\7\0\1\15\3\0\1\15\3\0\1\15\1\0"+
    "\1\15\6\0\1\15\6\0\1\15\7\0\1\15\3\0\1\15\3\0"+
    "\1\15\1\0\1\15\6\0\1\15\uff05\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\1\1\3\1\4\1\5\1\4"+
    "\1\1\4\4\2\1\12\5\1\2\1\0\1\6\3\0"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\5\1\15"+
    "\12\5\1\0\1\6\1\0\1\16\1\0\1\17\3\5"+
    "\1\20\7\5\1\0\1\21\4\5\1\22\2\5\1\23"+
    "\1\24\1\25\1\0\1\26\1\27\2\5\1\30\1\5"+
    "\1\31\1\32\1\33";

  private static int [] zzUnpackAction() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\162\0\230\0\276\0\344\0\u010a"+
    "\0\46\0\u0130\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214"+
    "\0\u023a\0\u0260\0\u0286\0\u02ac\0\u02d2\0\u02f8\0\u031e\0\u0344"+
    "\0\u036a\0\u0390\0\46\0\u03b6\0\u03dc\0\u0402\0\u0428\0\u044e"+
    "\0\46\0\46\0\46\0\46\0\46\0\46\0\u0474\0\u010a"+
    "\0\u049a\0\u04c0\0\u04e6\0\u050c\0\u0532\0\u0558\0\u057e\0\u05a4"+
    "\0\u05ca\0\u05f0\0\u0616\0\u063c\0\u063c\0\46\0\u0662\0\u010a"+
    "\0\u0688\0\u06ae\0\u06d4\0\u010a\0\u06fa\0\u0720\0\u0746\0\u076c"+
    "\0\u0792\0\u07b8\0\u07de\0\u0804\0\46\0\u082a\0\u0850\0\u0876"+
    "\0\u089c\0\u010a\0\u08c2\0\u08e8\0\u010a\0\u010a\0\u010a\0\u090e"+
    "\0\u010a\0\u010a\0\u0934\0\u095a\0\u010a\0\u0980\0\u010a\0\u010a"+
    "\0\u010a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\3\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\2\3\10\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\10\1\23\1\24\1\25"+
    "\1\10\1\26\2\10\1\27\2\10\1\30\1\10\1\31"+
    "\1\32\1\11\47\0\1\3\1\0\1\3\42\0\3\4"+
    "\1\33\42\4\4\0\1\34\46\0\1\6\1\35\1\36"+
    "\21\0\1\36\21\0\1\35\45\0\1\10\1\0\1\10"+
    "\3\0\3\10\6\0\21\10\1\0\3\37\1\0\6\37"+
    "\1\40\33\37\16\0\1\41\45\0\1\42\45\0\1\43"+
    "\45\0\1\44\51\0\1\45\46\0\1\46\27\0\1\10"+
    "\1\0\1\10\3\0\1\47\2\10\6\0\6\10\1\50"+
    "\12\10\6\0\1\10\1\0\1\10\3\0\3\10\6\0"+
    "\3\10\1\51\15\10\6\0\1\10\1\0\1\10\3\0"+
    "\3\10\6\0\5\10\1\52\13\10\6\0\1\10\1\0"+
    "\1\10\3\0\3\10\6\0\5\10\1\53\5\10\1\54"+
    "\5\10\6\0\1\10\1\0\1\10\3\0\3\10\6\0"+
    "\11\10\1\55\7\10\6\0\1\10\1\0\1\10\3\0"+
    "\3\10\6\0\10\10\1\56\10\10\6\0\1\10\1\0"+
    "\1\10\3\0\1\10\1\57\1\10\6\0\21\10\6\0"+
    "\1\10\1\0\1\10\3\0\3\10\6\0\10\10\1\60"+
    "\10\10\6\0\1\10\1\0\1\10\3\0\3\10\6\0"+
    "\13\10\1\61\5\10\6\0\1\10\1\0\1\10\3\0"+
    "\3\10\6\0\16\10\1\62\2\10\5\0\1\63\46\0"+
    "\1\35\1\0\1\36\21\0\1\36\21\0\1\64\2\0"+
    "\1\65\46\0\1\66\41\0\1\67\3\0\1\66\1\0"+
    "\2\37\36\0\1\10\1\0\1\10\3\0\1\10\1\70"+
    "\1\10\6\0\1\10\1\71\17\10\6\0\1\10\1\0"+
    "\1\10\3\0\3\10\6\0\1\72\20\10\6\0\1\10"+
    "\1\0\1\10\3\0\1\10\1\73\1\10\6\0\21\10"+
    "\6\0\1\10\1\0\1\10\3\0\3\10\6\0\6\10"+
    "\1\74\12\10\6\0\1\10\1\0\1\10\3\0\3\10"+
    "\6\0\2\10\1\75\16\10\6\0\1\10\1\0\1\10"+
    "\3\0\3\10\6\0\12\10\1\76\6\10\6\0\1\10"+
    "\1\0\1\10\3\0\3\10\6\0\1\77\20\10\6\0"+
    "\1\10\1\0\1\10\3\0\3\10\6\0\3\10\1\100"+
    "\15\10\6\0\1\10\1\0\1\10\3\0\3\10\6\0"+
    "\16\10\1\101\2\10\6\0\1\10\1\0\1\10\3\0"+
    "\3\10\6\0\1\102\20\10\6\0\1\10\1\0\1\10"+
    "\3\0\3\10\6\0\1\103\20\10\1\0\4\63\1\104"+
    "\41\63\5\0\1\64\45\0\1\67\3\0\1\105\41\0"+
    "\1\10\1\0\1\10\3\0\3\10\6\0\2\10\1\106"+
    "\16\10\6\0\1\10\1\0\1\10\3\0\1\107\2\10"+
    "\6\0\21\10\6\0\1\10\1\0\1\10\3\0\3\10"+
    "\6\0\2\10\1\110\16\10\6\0\1\10\1\0\1\10"+
    "\3\0\3\10\6\0\14\10\1\111\4\10\6\0\1\10"+
    "\1\0\1\10\3\0\3\10\6\0\5\10\1\112\13\10"+
    "\6\0\1\10\1\0\1\10\3\0\3\10\6\0\11\10"+
    "\1\113\7\10\6\0\1\10\1\0\1\10\3\0\3\10"+
    "\6\0\2\10\1\114\16\10\6\0\1\10\1\0\1\10"+
    "\3\0\3\10\6\0\3\10\1\115\15\10\6\0\1\10"+
    "\1\0\1\10\3\0\3\10\6\0\4\10\1\116\14\10"+
    "\6\0\1\10\1\0\1\10\3\0\1\117\2\10\6\0"+
    "\21\10\5\0\1\120\46\0\1\10\1\0\1\10\3\0"+
    "\1\10\1\121\1\10\6\0\21\10\6\0\1\10\1\0"+
    "\1\10\3\0\1\10\1\122\1\10\6\0\21\10\6\0"+
    "\1\10\1\0\1\10\3\0\3\10\6\0\3\10\1\123"+
    "\15\10\6\0\1\10\1\0\1\10\3\0\3\10\6\0"+
    "\11\10\1\124\7\10\6\0\1\10\1\0\1\10\3\0"+
    "\3\10\6\0\5\10\1\125\13\10\6\0\1\10\1\0"+
    "\1\10\3\0\3\10\6\0\15\10\1\126\3\10\5\0"+
    "\1\33\46\0\1\10\1\0\1\10\3\0\1\127\2\10"+
    "\6\0\21\10\6\0\1\10\1\0\1\10\3\0\3\10"+
    "\6\0\5\10\1\130\13\10\6\0\1\10\1\0\1\10"+
    "\3\0\1\10\1\131\1\10\6\0\21\10\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2470];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\1\11\21\1\1\11\1\0\1\1"+
    "\3\0\6\11\14\1\1\0\1\1\1\0\1\11\1\0"+
    "\14\1\1\0\1\11\12\1\1\0\11\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
// ************  Atributos y métodos ********************

// * Para acceder al número de línea (yyline es package)
public int getLine() { 
	// * Flex empieza en cero
	return yyline+1;
}

// * Para acceder al número de columna (yycolumn es package)
public int getColumn() { 
	// * Flex empieza en cero
	return yycolumn+1;
}

// * Valor semantico del token
private Object yylval;
public Object getYylval() {
	return this.yylval;
}



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 172) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 17: 
          { String s = yytext();
									//Obtenemos el string que hay entre la \ y la ultima ' (será el entero en formato string)
									String ascii_string = s.substring(2,s.length()-1);
									//Convertimos el string en entero, y el entero en char
									Character c = (char) Integer.parseInt(ascii_string);
								  	this.yylval = c;
									return Parser.CHAR_CONSTANT;
          }
        case 28: break;
        case 19: 
          { return Parser.CHAR;
          }
        case 29: break;
        case 13: 
          { return Parser.IF;
          }
        case 30: break;
        case 5: 
          { this.yylval = yytext();
									return Parser.ID;
          }
        case 31: break;
        case 1: 
          { //System.err.println ("Lexical error at line " 	+ this.getLine() + " and column "+getColumn()+":\n\tUnknow character \'"+ yycharat(0)+"\'."); 
				new ErrorType(this.getLine(), this.getColumn(), "Lexical error: Unknow character \'"+ yycharat(0)+"\'.");
          }
        case 32: break;
        case 8: 
          { this.yylval = yytext();
									return Parser.LESS_OR_EQUAL;
          }
        case 33: break;
        case 12: 
          { this.yylval = yytext();
									return Parser.OR;
          }
        case 34: break;
        case 27: 
          { return Parser.STRUCT;
          }
        case 35: break;
        case 4: 
          { this.yylval = yytext();
									return yytext().charAt(0);
          }
        case 36: break;
        case 21: 
          { return Parser.MAIN;
          }
        case 37: break;
        case 23: 
          { return Parser.PRINT;
          }
        case 38: break;
        case 10: 
          { this.yylval = yytext();
									return Parser.DISTINCT;
          }
        case 39: break;
        case 25: 
          { return Parser.RETURN;
          }
        case 40: break;
        case 11: 
          { this.yylval = yytext();
									return Parser.AND;
          }
        case 41: break;
        case 26: 
          { return Parser.DOUBLE;
          }
        case 42: break;
        case 18: 
          { return Parser.ELSE;
          }
        case 43: break;
        case 16: 
          { return Parser.DEF;
          }
        case 44: break;
        case 14: 
          { String s = yytext();
								  	//Comprobamos si el caracter es uno de los especiales
								  	if(s.equals("'\\n'")) this.yylval = '\n'; 
								  	else if(s.equals("'\\t'")) this.yylval = '\t';
								  	//Si no es que solo tiene un elemento dentro de las comillas
								  	else this.yylval = yytext().charAt(1);
									return Parser.CHAR_CONSTANT;
          }
        case 45: break;
        case 20: 
          { return Parser.VOID;
          }
        case 46: break;
        case 3: 
          { this.yylval = new Integer(yytext());
         			  				return Parser.INT_CONSTANT;
          }
        case 47: break;
        case 7: 
          { this.yylval = yytext();
									return Parser.EQUALS;
          }
        case 48: break;
        case 24: 
          { return Parser.WHILE;
          }
        case 49: break;
        case 9: 
          { this.yylval = yytext();
									return Parser.GREATER_OR_EQUAL;
          }
        case 50: break;
        case 6: 
          { this.yylval = new Double(yytext());
									return Parser.REAL_CONSTANT;
          }
        case 51: break;
        case 22: 
          { return Parser.INPUT;
          }
        case 52: break;
        case 15: 
          { return Parser.INT;
          }
        case 53: break;
        case 2: 
          { 
          }
        case 54: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return 0; }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
