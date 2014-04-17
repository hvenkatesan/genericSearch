/**
 * Created with IntelliJ IDEA.
 * User: hvenkatesan
 * Date: 4/15/14
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */

import grails.rest.Resource;

@Resource()
class Book {


    String title
    String author
    Double price

    static constraints = {
        title blank:false
        author blank:false
    }
}
