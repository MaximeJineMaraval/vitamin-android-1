# Modal component

## Modal design specs
You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `MaterialAlertDialogBuilder` class or the `VitaminModalBuilder` class. 

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="Your.AppTheme" parent="Theme.Vitamin.DayNight">
    ...
</style>
```

### Standard modal

```kotlin
VitaminModalBuilder(context)
    .setTitle("Title")
    .setMessage("Message")
    .setNegativeButton("Decline", null)
    .setPositiveButton("Accept", null)
    .show()
```

or

```kotlin
MaterialAlertDialogBuilder(context)
    .setTitle("Title")
    .setMessage("Message")
    .setNegativeButton("Decline", null)
    .setPositiveButton("Accept", null)
    .show()
```

### Centered modal

```kotlin
VitaminModalBuilderCentered(context)
    .setTitle("Title")
    .setMessage("Message")
    .setNegativeButton("Decline", null)
    .setPositiveButton("Accept", null)
    .show()
```

or

```kotlin
MaterialAlertDialogBuilder(context, R.style.ThemeOverlay_Vitamin_Modal_Centered)
    .setTitle("Title")
    .setMessage("Message")
    .setNegativeButton("Decline", null)
    .setPositiveButton("Accept", null)
    .show()
```

## Usage in standalone

If you don't want to inherit the full Vitamin theme on your
entire app, you can use this component in standalone.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```kotlin
val contextThemeWrapper = ContextThemeWrapper(requireContext(), R.style.Theme_Vitamin_DayNight)

MaterialAlertDialogBuilder(contextThemeWrapper, R.style.ThemeOverlay_Vitamin_Modal)
    .setTitle("Title")
    .setMessage("Message")
    .setNegativeButton("Decline", null)
    .setPositiveButton("Accept", null)
    .show()
```
