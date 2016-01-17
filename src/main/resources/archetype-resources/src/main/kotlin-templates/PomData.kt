#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}

internal object PomData {
	const val ARTIFACT_ID = "${symbol_dollar}{project.artifactId}";
	const val NAME = "${symbol_dollar}{project.name}";
	const val VERSION = "${symbol_dollar}{project.version}";
}
