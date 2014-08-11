package javatutorials.internationalization.formatting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

/**
 * NumberInput.java 
 *    Demo/resolve NumberFormat parsing issues
 *
 * @author Joe Sam Shirah / conceptGO
 */
public class NumberInput extends    JFrame
                         implements ActionListener,
                                    Runnable,
                                    WindowListener
{
  JButton    jbDInfo  = new JButton("Info"),
             jbIInfo  = new JButton("Info"),
             jbNF    = new JButton( "NF" ),
             jbNFPP = new JButton( "NFPP" ),
             jbNoCheck  = new JButton( "NoCheck" );
  JLabel     jl,
             jlDLPP = new JLabel( 
               "", SwingConstants.CENTER ),
             jlILPP = new JLabel( 
               "", SwingConstants.CENTER );
  JPanel     jpCenter     = new JPanel(),
             jpCenterNest = new JPanel( 
                new GridLayout(0, 5, 3, 2) ),
             jpNorth      = new JPanel(),
             jpSouth      = new JPanel();
  JTextField jtD =    new JTextField( 6 ),
             jtDOrg = new JTextField( 6 ),
             jtI =    new JTextField( 6 ),
             jtIOrg = new JTextField( 6 );
  
  NumberFormat nfDLocal = 
     NumberFormat.getNumberInstance(),
               nfILocal = 
     NumberFormat.getIntegerInstance();

  ParsePosition pp;
  String  sDInfo,
          sIInfo;


  public NumberInput()
  {
    super( "NumberInput" );
    addWindowListener( this );

    nfDLocal.setMinimumFractionDigits( 1 );
    initDisplay();
    pack();
    show();

    pp = new ParsePosition( 0 );
    if( nfDLocal instanceof DecimalFormat )
    { 
      sDInfo = getInfoString( 
        (DecimalFormat)nfDLocal, 123456.7 );
      sIInfo = getInfoString( 
        (DecimalFormat)nfILocal, 1234567 );
      EventQueue.invokeLater( this ); 
    }

  }  // end constructor


  public String getInfoString( DecimalFormat df, 
                               double        dVal )
  {
    DecimalFormatSymbols dfs = 
       df.getDecimalFormatSymbols();

    char cDecSep = dfs.getDecimalSeparator(),
         cGroupSep = dfs.getGroupingSeparator(),
         cMinusSign = dfs.getMinusSign();

    String sNP = df.getNegativePrefix(),
           sNS = df.getNegativeSuffix(),
           sPP = df.getPositivePrefix(),
           sPS = df.getPositiveSuffix();

    StringBuffer sb = new StringBuffer( 320 );
      
    // set up info display string
//    sb.append( "DecimalFormat and ");
//    sb.append( "\nDecimalFormatSymbols Data");
    sb.append( "Decimal Separator:   ");
    sb.append(  cDecSep );
    sb.append( "   (0x" );
    sb.append(  Integer.toHexString( cDecSep ) );
    sb.append( ")\nGrouping Separator:   " );
    sb.append(  cGroupSep );
    sb.append( "   (0x" );
    sb.append(  Integer.toHexString( cGroupSep ) );
    sb.append( ")\nMinus Sign:   " );
    sb.append(  cMinusSign );
    sb.append( "   (0x" );
    sb.append(  Integer.toHexString( cMinusSign ) );
    sb.append( ")\nPattern:   " );
    sb.append(  df.toPattern() );
    sb.append( "\nLocalized Pattern:   " );
    sb.append(  df.toLocalizedPattern() );
    sb.append( "\nNegative Prefix:   " );
    sb.append( ( sNP.equals("") ? 
                "none" : ">" + sNP + "<" ) );
    sb.append( "\nNegative Suffix:   " );
    sb.append( ( sNS.equals("") ? 
                "none" : ">" + sNS + "<" ) );
    sb.append( "\nPositive Prefix:   " );
    sb.append( ( sPP.equals("") ? 
                "none" : ">" + sPP + "<" ) );
    sb.append( "\nPositive Suffix:   " );
    sb.append( ( sPS.equals("") ? 
                "none" : ">" + sPS + "<" ) );
    sb.append( "\nNegative Input:   " );
    sb.append(  df.format( -dVal ) );
    sb.append( "\nPositive Input:   " );
    sb.append(  df.format( dVal ) );

    return sb.toString(); 
  } // end getInfoString


  public void initDisplay()
  {
    Font   f;
    Locale l = Locale.getDefault();
    String s;

    jl = new JLabel("Default Locale: " + 
       l.getLanguage() + "_" + l.getCountry() + 
       " = " + l.getDisplayName() );
    f = jl.getFont();
    jtD.setFont( f );
    jtD.setHorizontalAlignment( 
       SwingConstants.RIGHT );
    jtD.setText( nfDLocal.format( 123456.7 ) );
    s = jtD.getText();
    initOLPP( f, jtDOrg, s, jlDLPP );
    jtI.setFont( f );
    jtI.setHorizontalAlignment( 
       SwingConstants.RIGHT );
    jtI.setText( nfILocal.format( 1234567 ) );
    s = jtI.getText();
    initOLPP( f, jtIOrg, s, jlILPP );

    jbNoCheck.addActionListener( this );
    jbNF.addActionListener( this );
    jbDInfo.setEnabled( false );
    jbDInfo.addActionListener( this );
    jbIInfo.setEnabled( false );
    jbIInfo.addActionListener( this );
    jbNFPP.addActionListener( this );

    jpNorth.add( jl );
    jpCenterNest.add( new JLabel( "" ) );
    jpCenterNest.add( new JLabel( 
      "Value", SwingConstants.CENTER ) );
    jpCenterNest.add( new JLabel( 
      "Format", SwingConstants.CENTER ) );
    jpCenterNest.add( new JLabel( 
      "Original", SwingConstants.CENTER ) );
    jpCenterNest.add( new JLabel( 
      "Length / PP", SwingConstants.CENTER ) );
    jpCenterNest.add( new JLabel( 
      "Double:  ", SwingConstants.RIGHT ) );
    jpCenterNest.add( jtD );
    jpCenterNest.add( jbDInfo );
    jpCenterNest.add( jtDOrg );
    jpCenterNest.add( jlDLPP );
    jpCenterNest.add( new JLabel( 
      "Integer: ", SwingConstants.RIGHT ) );
    jpCenterNest.add( jtI );
    jpCenterNest.add( jbIInfo );
    jpCenterNest.add( jtIOrg );
    jpCenterNest.add( jlILPP );
    jpCenter.add( jpCenterNest );
    jpSouth.add( jbNoCheck );
    jpSouth.add( jbNF );
    jpSouth.add( jbNFPP );

    Container cp = getContentPane();
    cp.add( jpNorth, BorderLayout.NORTH );
    cp.add( jpCenter, BorderLayout.CENTER );
    cp.add( jpSouth, BorderLayout.SOUTH );    
  } // end initDisplay


  public void initOLPP( Font f,   JTextField jt, 
                        String s, JLabel jl )
  {
    jt.setFont( f );
    jt.setForeground( Color.BLUE.darker() );
    jt.setHorizontalAlignment( jt.RIGHT );
    jt.setEditable( false );
    jt.setText( s );
    jl.setText( s.length() + " / NA" );
    jl.setForeground( Color.GREEN.darker().darker() );
  } // end initOLPP


  public void NFInput( String sDouble, String sInt )
  { // "standard" NumberFormat parsing
    double d;
    int    i;
    Number n;

    try
    {
      n = nfDLocal.parse( sDouble );
      d = n.doubleValue();
      jtD.setText( nfDLocal.format( d ) );
      showInfoMsg( "Double Accepted \n" + d );
      n = nfILocal.parse( sInt );
      i = n.intValue();
      jtI.setText( nfILocal.format( i ) );
      showInfoMsg( "Int Accepted \n" + i );
    }
    catch( ParseException  pe ) 
    { 
      showErrorMsg( 
        "ParseException for:\n" + 
         pe.getLocalizedMessage() );
    }
  } // end NFInput


  public void NFPPInput( String sDouble, 
                         String sInt )
  { // validate NumberFormat with ParsePosition 
    Number n;
    double d;
    int    i;

    pp.setIndex( 0 );
    n = nfDLocal.parse( sDouble, pp );

    if( sDouble.length() != pp.getIndex() || 
        n == null )
    {
      showErrorMsg( 
        "Double Input Not Acceptable\n" + 
         "\"" + sDouble + "\"");
    }
    else
    {
      d = n.doubleValue();
      jtD.setText( nfDLocal.format( d ) );
      showInfoMsg( "Double Accepted \n" + d );
    }

    pp.setIndex( 0 );
    n = nfILocal.parse( sInt, pp );
    if( sInt.length() != pp.getIndex()  || 
        n == null )
    {
      showErrorMsg( 
        "Int Input Not Acceptable \n" + 
         "\"" + sInt + "\"");
    }
    else
    {
      i = n.intValue();
      jtI.setText( nfILocal.format( i ) );
      showInfoMsg( "Int Accepted \n" + i );
    }
  } // end NFPPInput


  public void noCheckInput( String sDouble, 
                            String sInt )
  { // normal Double.parseDouble, Integer.parseInt
    double d;
    int    i;

    try
    {
      d = Double.parseDouble( sDouble );
      jtD.setText( nfDLocal.format( d ) );
      showInfoMsg( "Double Accepted: \n" + d );
      i = Integer.parseInt( sInt );
      jtI.setText( nfILocal.format( i ) );
      showInfoMsg( "Int Accepted: \n" + i );
    }
    catch( NumberFormatException  nfe ) 
    { 
      showErrorMsg( 
        "NumberFormatException \n" + 
         nfe.getLocalizedMessage() );
    }
  } // end noCheckInput


  public void run()
  {
    jbDInfo.setEnabled( true );
    jbIInfo.setEnabled( true );
  } // end run


  public void setOLPP( NumberFormat nf, JTextField jt, 
     String s, JLabel jlLPP, boolean bNA  )
  {
    int iLength,
        iPP = 0;

    if( !bNA )
    {
      pp.setIndex( 0 );
      nf.parse( s, pp );
      iPP = pp.getIndex();
    }
    jt.setText( s );
    iLength = s.length();
    jlLPP.setText( iLength + " / " + 
       (bNA ? "NA" : "" + iPP) );

    if( bNA || 
       (iLength == iPP && iLength > 0) )
    { 
      jlLPP.setForeground( 
         Color.GREEN.darker().darker() );
    }     
    else
    { jlLPP.setForeground( Color.RED.darker() ); } 
  } // end setOLPP


  public void showErrorMsg( String sMsg )
  {
    Toolkit.getDefaultToolkit().beep();
    JOptionPane.showMessageDialog( this, sMsg, 
      "NumberInput Error", 
       JOptionPane.ERROR_MESSAGE );
  } // end showMsg


  public void showInfoMsg( String sMsg )
  {
    JOptionPane.showMessageDialog( this, sMsg, 
      "NumberInput Message", 
       JOptionPane.INFORMATION_MESSAGE );
  } // end showMsg
  

  // ActionListener Implementation
  public void actionPerformed(ActionEvent ae)
  {
    String sDouble,
           sInt;
    Object oSource = ae.getSource();

    if( oSource == jbDInfo ) 
    { 
      showInfoMsg( sDInfo );
      return;
    }
    if( oSource == jbIInfo ) 
    { 
      showInfoMsg( sIInfo );
      return;
    }

    sDouble = jtD.getText().trim();
    sInt    = jtI.getText().trim();
    setOLPP( nfDLocal, jtDOrg, 
       sDouble, jlDLPP, (oSource == jbNoCheck) );
    setOLPP( nfILocal, jtIOrg, 
       sInt, jlILPP, (oSource == jbNoCheck) );

    if( oSource == jbNoCheck ) 
    { noCheckInput( sDouble, sInt ); }
    else
    if( oSource == jbNF ) 
    { NFInput( sDouble, sInt ); }
    else
    if( oSource == jbNFPP ) 
    { NFPPInput( sDouble, sInt ); }

  }  // End actionPerformed


// Window Listener Implementation
  public void windowOpened(WindowEvent we) {}
  public void windowClosing(WindowEvent we)
  {
    dispose();
    System.exit(0);
  }
  public void windowClosed(WindowEvent we) {}
  public void windowIconified(WindowEvent we) {}
  public void windowDeiconified(WindowEvent we) {}
  public void windowActivated(WindowEvent we) {}
  public void windowDeactivated(WindowEvent we) {}
// End Window Listener Implementation


  public static void main(String[] args)
  {
    Runnable runnable = new Runnable() 
    {
      public void run() 
      {
        new NumberInput();
      }
    }; 

   EventQueue.invokeLater( runnable );

  }  // end main

}  // end class NumberInput
