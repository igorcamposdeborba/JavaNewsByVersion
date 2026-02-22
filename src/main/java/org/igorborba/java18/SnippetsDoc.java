package org.igorborba.java18;

public class SnippetsDoc {
    private String id;

    // { @snippet: } keep indentation in the java doc
    /** Default construtor
    * {@snippet :
    * public SnippetsDoc(String id){
    *     this.id = id;
    * }
    * }
    */
    public SnippetsDoc(String id){
        this.id = id;
    }

    /** Method hello:
     * {@snippet :
     *  public String sayHello(){
     *      return "Hello";
     * }
     * }
     */
    public String sayHello(){
            return "Hello";
        }
}


