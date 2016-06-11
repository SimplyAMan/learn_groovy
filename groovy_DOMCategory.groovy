import groovy.xml.DOMBuilder
import groovy.xml.dom.DOMCategory
def doc = DOMBuilder.parse(new FileReader('data/plan.xml'))
def plan = doc.documentElement

use(DOMCategory) {
    println 'plan.name() - ' + plan.name()
    println 'plan.week[0].name() - ' + plan.week[0].name()
    println 'plan.week[0].\'@capacity\' - ' + plan.week[0].'@capacity'
    println 'plan.week.task[0].name() - ' + plan.week.task[0].name()
    println 'plan.week.task[0].text() - ' + plan.week.task[0].text()
    println 'plan.week.task[0].text() - ' + plan.week.task[1].name()
}