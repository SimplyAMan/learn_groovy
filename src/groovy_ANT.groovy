def deploy = new XmlParser().parse(new File("../data/config.xml"))

def sql_dir
if (deploy['change_request'].size() != 0) {
    sql_dir = deploy['change_request'].text()
    println sql_dir
}

new File(sql_dir).deleteDir()
new File(sql_dir).mkdir()

def result
def svn_url
def svn_revision
def svn_command

println deploy['scripts']

/*
deploy['scripts']['svn'].eachWithIndex {
    it, i -&gt;
    svn_url = it['url'].text()
    svn_revision = it['revision'].text()
    result = svn_url =~ "(http://.+/)*(.+\\.[SQLsql]+)"
    if (result.matches()) {
        svn_command = "svn export " + svn_url + "@" + svn_revision + " " + properties['sql.dir'] + "\\" + (i+1).toString().padLeft( 2, '0' ) + "_" + result[0][2]
        println svn_command
        process = svn_command.execute()
        process.text.eachLine {println it}
        if (process.exitValue() != 0) {
            println "!!! ERROR EXECUTE COMMAND $svn_command !!!"
        }

    }
}
*/