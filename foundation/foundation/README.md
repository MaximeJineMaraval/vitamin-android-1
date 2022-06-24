# Foundation module

## Responsibilities

This module is used by all Vitamin component artifacts to apply the correct design specification and
contain atomic components of the Decathlon Design System with:

* Vitamix icons
* Vitamin text styles
* Vitamin semantic colors
* Vitamin theme with semantics biding

These resources are public and can be imported as a standalone artifact in an external application.

## How to use it?

If you want to use this module because you are only interested by Vitamin colors, texts or icons,
you can import this dependency in your `build.gradle` file of your Android project:

````kotlin
implementation("com.decathlon.vitamin:foundation:<version>")
```` 

If you want to use the theme defined in this module, you need to know that only semantics references
are mapped in the base theme. It is your responsibility to fill all references (typographies, colors
and component) in your custom theme.
Please note that *it is not recommended*. You can find finals themes in the [vitamin module](https://github.com/Decathlon/vitamin-android/tree/main/vitamin)

```xml

<style name="Your.AppTheme" parent="Base.Theme.Vitamin.Foundation">
    <!-- Components mapping here... -->
    <!-- Typograhy mapping here... -->
    <!-- Colors mapping here... -->
</style>
```