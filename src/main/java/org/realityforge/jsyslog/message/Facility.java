package org.realityforge.jsyslog.message;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public enum Facility
{
  KERN,
  USER,
  MAIL,
  DAEMON,
  AUTH,
  SYSLOG,
  LPR,
  NEWS,
  UUCP,
  CRON,
  AUTHPRIV,
  FTP,
  NTP,
  AUDIT,
  ALERT,
  CLOCK,
  LOCAL0,
  LOCAL1,
  LOCAL2,
  LOCAL3,
  LOCAL4,
  LOCAL5,
  LOCAL6,
  LOCAL7;

  @Nullable
  public static String getName( final int facility )
  {
    final Facility[] values = Facility.values();
    if( 0 > facility || values.length <= facility )
    {
      return null;
    }
    else
    {
      return values[ facility ].name();
    }
  }

  @Nullable
  public static Integer getFacility( @Nonnull final String name )
  {
    for( final Facility facility : Facility.values() )
    {
      if( facility.name().equalsIgnoreCase( name ) )
      {
        return facility.ordinal();
      }
    }
    return null;
  }
}
