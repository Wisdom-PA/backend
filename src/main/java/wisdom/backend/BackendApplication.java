package wisdom.backend;

/**
 * Entry marker for optional cloud services (sync, updates, etc.).
 */
public final class BackendApplication {

    /**
     * Stable service id for logs and health checks.
     */
    public String serviceId() {
        return "wisdom-backend";
    }
}
