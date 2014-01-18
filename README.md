jsyslog-message
===============

[![Build Status](https://secure.travis-ci.org/realityforge/jsyslog-message.png?branch=master)](http://travis-ci.org/realityforge/jsyslog-message)

A tiny library for parsing syslog messages.

Quick Start
-----------

The easiest way to use the library is to add the following maven dependency to your project.

```xml
<dependency>
   <groupId>org.realityforge.jsyslog-message</groupId>
   <artifactId>jsyslog-message</artifactId>
   <version>1.2</version>
</dependency>
```

Then you can start parsing syslog message using either `SyslogMessage.parseStructuredSyslogMessage( "..." )`
to parse modern structured syslog messages or `SyslogMessage.parseRFC3164SyslogMessage( "..." )` to parse
the older RFC3164 style syslog messages.
