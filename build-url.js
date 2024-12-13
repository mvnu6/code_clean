function buildUrl(url, options) {
    if (!url && !options) return '';

    const base = determineBaseUrl(url, options);
    const path = appendPath(base, options);
    const queryString = buildQueryString(options);
    const hash = appendHash(options);

    return [path, queryString, hash].filter(Boolean).join('');
}

function determineBaseUrl(url, options) {
    if (!url) return '';
    if (typeof url === 'object') return '';
    return url;
}

function appendPath(base, options) {
    if (options?.path) {
        return `${base}/${options.path}`;
    }
    return base;
}

function buildQueryString(options) {
    if (!options?.queryParams) return '';

    const queryString = Object.entries(options.queryParams)
        .map(([key, value]) => `${key}=${value}`)
        .join('&');

    return queryString ? `?${queryString}` : '';
}

function appendHash(options) {
    if (options?.hash) {
        return `#${options.hash}`;
    }
    return '';
}
