def deploy = new XmlParser().parse(new File('../data/config.xml'))

println 'deploy.name() - ' + deploy.name()
println 'deploy.text() - ' + deploy.text()

println deploy.change_request[0].text()
println deploy.scripts[0].svn[0].url[0].text()
println deploy.scripts[0].svn[0].revision[0].text()

/*
println 'plan.week[0].name() - ' + plan.week[0].name()
def firstTask = plan.week[0].task[0]
println 'firstTask = plan.week[0].task[0]'
println 'firstTask.name() - ' + firstTask.name()
println 'firstTask.text() - ' + firstTask.text()
println 'firstTask.@title - ' + firstTask.@title
println 'firstTask.@done - ' + firstTask.@done
*/
