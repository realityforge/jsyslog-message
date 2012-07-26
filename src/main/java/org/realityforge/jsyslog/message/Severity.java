package org.realityforge.jsyslog.message;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public enum Severity
{
  EMERG, ALERT, CRIT, ERR, WARNING, NOTICE, INFO, DEBUG;

  @Nullable
  public static String getName( final int facility )
  {
    final Severity[] values = Severity.values();
    if( 0 > facility || facility >= values.length )
    {
      return null;
    }
    else
    {
      return values[ facility ].name();
    }
  }

  public static Integer getSeverity( @Nonnull final String name )
  {
    for( final Severity facility : Severity.values() )
    {
      if( facility.name().equalsIgnoreCase( name ) )
      {
        return facility.ordinal();
      }
    }
    return null;
  }
}
