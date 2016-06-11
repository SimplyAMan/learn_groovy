def plan = new XmlParser().parse(new File('../data/plan.xml'))
println 'plan.name() - ' + plan.name()
println 'plan.week[0].name() - ' + plan.week[0].name()
def firstTask = plan.week[0].task[0]
println 'firstTask = plan.week[0].task[0]'
println 'firstTask.name() - ' + firstTask.name()
println 'firstTask.text() - ' + firstTask.text()
println 'firstTask.@title - ' + firstTask.@title
println 'firstTask.@done - ' + firstTask.@done