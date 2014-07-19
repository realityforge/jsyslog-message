require 'buildr/custom_pom'
require 'buildr/gpg'
require 'buildr/git_auto_version'

desc "jSyslog Message: A tiny library for parsing syslog messages"
define 'jsyslog-message' do
  project.group = 'org.realityforge.jsyslog-message'
  compile.options.source = '1.6'
  compile.options.target = '1.6'
  compile.options.lint = 'all'

  pom.add_apache_v2_license
  pom.add_github_project('realityforge/jsyslog-message')
  pom.add_developer('realityforge', 'Peter Donald')
  pom.optional_dependencies.concat [:javax_annotation]

  compile.with :javax_annotation, :joda_time

  test.using :testng

  package(:jar)
  package(:sources)
  package(:javadoc)
end
