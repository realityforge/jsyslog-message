package org.realityforge.jsyslog.message;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SeverityTest
{
  @Test
  public void check()
  {
    for( final Severity severity : Severity.values() )
    {
      assertEquals( Severity.getName( severity.ordinal() ), severity.name() );
      assertEquals( Severity.getSeverity( severity.name() ).intValue(), severity.ordinal() );
      assertEquals( Severity.getSeverity( severity.name().toLowerCase() ).intValue(), severity.ordinal() );
    }
    assertNull( Severity.getName( -1 ) );
    assertNull( Severity.getName( 10000 ) );
    assertNull( Severity.getSeverity( "blah" ) );
  }
}
