# react-native-location-status

Checks if location is enabled on the device

## Installation

```sh
npm install react-native-location-status
```

## Usage


```js
import { isLocationEnabled } from 'react-native-location-status';

// ...

const result = await isLocationEnabled(); // `true` or `false` (Android only)
```

<sub>NOTE: iOS is not supported. Calling `isLocationEnabled()` on iOS will
always return `false`.</sub>


## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MPL-2.0

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
