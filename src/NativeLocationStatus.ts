import type { TurboModule } from 'react-native';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  isLocationEnabled(): Promise<boolean>;
}

export default TurboModuleRegistry.getEnforcing<Spec>('LocationStatus');
