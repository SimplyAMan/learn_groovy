def node = new XmlParser().parse(new File('../data/plan.xml'))

node.week.each {
    println it.text()
}
