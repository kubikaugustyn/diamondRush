var __author__ = "kubik.augustyn@post.cz"

import {Long, Exception} from "../../../data_types.js";

export class MIDletStateChangeException extends Exception {
    constructor(...args) {
        super()
        this.serialVersionUID = new Long(1)
        if (java_tools.areArgumentsInForm(args,[])){}
        else if (java_tools.areArgumentsInForm(args,["string"])){
            super(args[0])
        }
    }
}
