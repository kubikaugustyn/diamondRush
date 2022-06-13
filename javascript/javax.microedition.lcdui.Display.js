var __author__ = "kubik.augustyn@post.cz"

var Display = {
    getDisplay: cls => {
        return new class Display {
            constructor(cls) {
                this.cls = {}

                this.setCurrent = this.setCurrent.bind(this)
                this.notifyPaused = this.notifyPaused.bind(this)
                this.notifyDestroyed = this.notifyDestroyed.bind(this)

                this.setCurrent(cls)
            }

            setCurrent(cls){
                if(this.cls.notifyPaused)delete this.cls.notifyPaused
                if(this.cls.notifyDestroyed)delete this.cls.notifyDestroyed
                this.cls = cls
                this.cls.notifyPaused = this.notifyPaused
                this.cls.notifyDestroyed = this.notifyDestroyed
            }

            notifyPaused(){
                console.log("Display => getDisplay => new class Display => notifyPaused()")
            }

            notifyDestroyed(){
                console.log("Display => getDisplay => new class Display => notifyDestroyed()")
            }
        }(cls)
    }
}
