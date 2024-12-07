# react-native-location-status

Checks if location is enabled on the device

<!-- BADGES -->
[![](https://badgen.net/github/license/thehale/BinaryClock)](https://github.com/thehale/BinaryClock/blob/master/LICENSE)
[![](https://badgen.net/badge/icon/Sponsor/pink?icon=github&label)](https://github.com/sponsors/thehale)
[![Joseph Hale's software engineering blog](https://jhale.dev/badges/website.svg)](https://jhale.dev)
[![](https://jhale.dev/badges/follow.svg)](https://www.linkedin.com/comm/mynetwork/discovery-see-all?usecase=PEOPLE_FOLLOWS&followMember=thehale)

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
