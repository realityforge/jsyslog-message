desc "jSyslog Message: A tiny library for parsing syslog messages"
define('jsyslog-message') do
  project.version = `git describe --tags --always`.strip
  project.group = 'org.realityforge'
  compile.options.source = '1.6'
  compile.options.target = '1.6'
  compile.options.lint = 'all'

  compile.with :javax_annotation, :joda_time

  test.using :testng

  package(:jar)
end
