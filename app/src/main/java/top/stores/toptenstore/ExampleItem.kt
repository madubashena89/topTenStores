package top.stores.toptenstore

class ExampleItem {
    private lateinit var  mImageUrl : String
    private lateinit var mCreater : String

    constructor(mImageUrl: String, mCreater: String) {
        this.mImageUrl = mImageUrl
        this.mCreater = mCreater
    }

    fun getImageUrl() :String{
        return mImageUrl
    }

    fun getmCreater () : String{
        return mCreater
    }
}