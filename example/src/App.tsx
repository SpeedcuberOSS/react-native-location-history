import { Button, StyleSheet, Text, View, useColorScheme } from 'react-native';

import { Colors } from 'react-native/Libraries/NewAppScreen';
import { isLocationEnabled } from 'react-native-location-status';
import { useState } from 'react';

export default function App() {
  const [result, setResult] = useState<boolean | undefined>();
  const [checkCount, setCheckCount] = useState(0);
  const isDarkMode = useColorScheme() === 'dark';

  function checkLocation() {
    setCheckCount(checkCount + 1);
    isLocationEnabled().then((v) => {
      console.debug(`Received from Native: ${v}`);
      setResult(v);
    });
  }
  if (checkCount === 0) {
    checkLocation();
  }

  return (
    <View style={styles.container}>
      <Text style={{ color: isDarkMode ? Colors.white : Colors.black }}>
        Result: {JSON.stringify(result)}
      </Text>
      <Text style={{ color: isDarkMode ? Colors.white : Colors.black }}>
        Checks: {checkCount}
      </Text>
      <Button title="Refresh" onPress={checkLocation} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
