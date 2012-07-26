package org.realityforge.jsyslog.message;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class FacilityTest
{
  @SuppressWarnings( "ConstantConditions" )
  @Test
  public void check()
  {
    for( final Facility facility : Facility.values() )
    {
      assertEquals( Facility.getName( facility.ordinal() ), facility.name() );
      assertEquals( Facility.getFacility( facility.name() ).intValue(), facility.ordinal() );
      assertEquals( Facility.getFacility( facility.name().toLowerCase() ).intValue(), facility.ordinal() );
    }
    assertNull( Facility.getName( -1 ) );
    assertNull( Facility.getName( 10000 ) );
    assertNull( Facility.getFacility( "blah" ) );
  }
}
