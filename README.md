
# react-native-key-events

## Getting started

`$ npm install react-native-key-events --save`

### Mostly automatic installation

`$ react-native link react-native-key-events`

### Manual installation

#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-key-events` and add `RNKeyEvents.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNKeyEvents.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.ingvardm.KeyEvents.RNKeyEventsPackage;` to the imports at the top of the file
  - Add `new RNKeyEventsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-key-events'
  	project(':react-native-key-events').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-key-events/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-key-events')
  	```
---
## API
### keyPress(key, callback, prevent_default)
subscribe for key event
| Argument        | Type     | Default | Description                                            |
| --------------- |:---------| :------:| :----------------------------------------------------: |
| key             | string   | NULL    | one of ...RNKeyEvents.KEYS                             |
| callback        | function | NULL    | will recieve action, one of ...RNKeyEvents.KEY_ACTIONS |
| prevent_default | boolean  | false   | prevent propagation of the event                       |

### off(key)
unsubscribe from key event
| Argument        | Type     | Default | Description                                            |
| --------------- |:---------| :------:| :----------------------------------------------------: |
| key             | string   | NULL    | one of ...RNKeyEvents.KEYS                             |
---
## Usage
```javascript
import RNKeyEvents, { KEYS, KEY_ACTIONS} from 'react-native-key-events'

RNKeyEvents.keyPress(KEYS.VOLUME_DOWN, onVolumeDown)

function onVolumeDown(action){
	if(action === KEY_ACTIONS.KEY_DOWN) console.log('user pressed volume down...')
	else if(action === KEY_ACTIONS.KEY_UP) console.log('user released volume down...')
}
```
---
## Contributions
#### Yes, please!
---

made with ❤️ by [Igor Poughatch](https://github.com/ingvardm)