package modules

import daos.NumberDao
import scaldi.Module
/**
 * Application's dependency injections
 */
class WebModule extends Module {
  bind[NumberDao] to new NumberDao
}
