/**
 * Created by ahuryn on 09.06.2016.
 */
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node
String info(node) {
    switch (node.nodeType) {
        case Node.ELEMENT_NODE:
            return 'element: '+ node.nodeName
        case Node.ATTRIBUTE_NODE:
            return "attribute: ${node.nodeName}=${node.nodeValue}"
        case Node.TEXT_NODE:
            return 'text: '+ node.nodeValue
    }
    return 'some other type: '+ node.nodeType
}

def fac = DocumentBuilderFactory.newInstance();
def builder = fac.newDocumentBuilder();
def doc = builder.parse(new FileInputStream('data/plan.xml'));

def plan = doc.documentElement;

println('info(plan) - ' + info(plan))

def firstWeek = plan.childNodes.find { it.nodeName == 'week' }
println('info(firstWeek) - ' + info(firstWeek))
def firstTask = firstWeek.childNodes.item(1)
println('info(firstTask) - ' + info(firstTask))
def firstTaskText = firstTask.childNodes.item(0)
println('firstTask.childNodes.item(0) - ' + info(firstTaskText))
def firstTaskTitle = firstTask.attributes.getNamedItem('title')
println('firstTask.attributes.getNamedItem(\'title\') - ' + info(firstTaskTitle))
def firstTaskTitleText = firstTaskTitle.childNodes.item(0)
println('firstTask.attributes.getNamedItem(\'title\').childNodes.item(0) - ' + info(firstTaskTitleText))
//println(plan.childNodes.item(5))
//
//println(plan.childNodes.length)


//println(doc.getClass())

//println(plan.getClass())