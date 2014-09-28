# Material Dialog

This is an Android library, I call it MaterialDialog. It's very easy to use. Just new it, then the beautiful AlertDialog will show automatedly. It is artistic, conforms to Google Material Design. I hope that you can like it, and enjoys it. ^ ^

## Screenshots

<img src="/screenshots/s1.png" alt="main" title="screenshot" width="270" height="486" />  <img src="/screenshots/s2.png" alt="main" title="screenshot" width="270" height="486" />
<img src="/screenshots/s3.png" alt="main" title="screenshot" width="486" height="270" />

## Usage
### Step 1

Import the library, then add it to your `/settings.gradle` and `/app/build.gradle`, if you don't know how to do it, you can read my blog for help.

[Android Studio 简介及导入 jar 包和第三方开源库方法](http://drakeet.me/android-studio)

### Step 2

It very easy, just like this:

```java
mMaterialDialog = new MaterialDialog(this);
mMaterialDialog.setTitle("MaterialDialog");
mMaterialDialog.setMessage("hello world!");
mMaterialDialog.setPositiveButton("OK", new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        mMaterialDialog.dismiss();
        ...
    }
});

mMaterialDialog.setNegativeButton("CANCLE", new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        mMaterialDialog.dismiss();
        ...
    }
});
```
With the first init, it will show automatedly. Or, you can init it and call the `mMaterialDialog.show()` to show the dialog simply.

## About me

A student in mainland China. (^ ^ Thanks daimajia)

My blog: http://drakeet.me

More about me: http://drakeet.me/about

